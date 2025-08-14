package com.group0505team2.repos;

import com.group0505team2.entity.Transaction;
import com.group0505team2.enums.Category;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;



public class TransactionRepository {

    private final Map<Integer, List<Transaction>> storage = new HashMap<>();
    private final AtomicInteger idSeq = new AtomicInteger(1);

    public Transaction create(int accountId, Transaction tx) {
        Transaction toSave = tx;
        if(tx.getId() <= 0) {
            toSave = new Transaction(
                    idSeq.getAndIncrement(),
                    tx.getDate(),
                    tx.getDesc(),
                    tx.getCategory(),
                    tx.getAmount()
            );
        }
        storage.computeIfAbsent(accountId, k -> new ArrayList<>()).add(toSave);
        return toSave;
    }
    public List<Transaction> findByAccount(int accountId) {
        return new ArrayList<>(storage.getOrDefault(accountId, Collections.emptyList()));
    }
    public Optional<Transaction> findById(int accountId, int txId) {
        return storage.getOrDefault(accountId, List.of()).stream()
                .filter(t -> t.getId() == txId)
                .findFirst();
    }

    public Transaction update(int accountId, int txId, LocalDate date, String desc, Category category, Double amount) {
        List<Transaction> list = storage.get(accountId);
        if(list == null) throw new IllegalArgumentException("account not found: " + accountId);

        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == txId) {
                Transaction updated = new Transaction(txId, date, desc, category, amount);
                list.set(i, updated);
                return  updated;
            }
        }
        throw new IllegalArgumentException("transaction not found: " + txId);
    }
    public boolean deleteById(int accountId, int txId) {
        List<Transaction> list = storage.get(accountId);
        if(list == null) return false;
        return list.removeIf(t -> t.getId() == txId);
    }
    public int deleteByAccount(int accountId) {
        List<Transaction> removed = storage.remove(accountId);
        return removed == null ? 0 : removed.size();
    }
    public List<Transaction> findByFilters(int accountId, LocalDate from, LocalDate to, Category category) {
        return storage.getOrDefault(accountId, List.of()).stream()
                .filter(t -> from == null || !t.getDate().isBefore(from))
                .filter(t -> to == null || !t.getDate().isAfter(to))
                .filter(t -> category == null || t.getCategory() == category)
                .sorted(Comparator.comparing(Transaction::getDate))
                .collect(Collectors.toList());
    }
    public double sumByMonth(int accountId, int year,  int month) {
        return storage.getOrDefault(accountId,List.of()).stream()
                .filter(t -> t.getDate().getYear() == year && t.getDate().getMonthValue() == month)
                .mapToDouble(Transaction::getAmount)
                .sum();
    }
}
