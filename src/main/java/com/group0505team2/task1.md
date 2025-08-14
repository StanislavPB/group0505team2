public class User{

        private String name;
        private String login;
        private String password;
        private String address;
        private String profession;
        private List<Account> accounts;
}

public class Account{

        private int id;
        private User user;
        private double balance;
        private List<Transaction> transactions;
}

public class Transaction{

        private int id;
        private LocalDate date;
        private String desc;
        private enum Category;
        private double amount;
}

repository{

        method1{
            create;
        }
        method2{
            update;
        }
        method3{
            read;
        }
        method4{
            delete;
        }

        .filter1{
            findById;
        }
        .filter2{
            findByDate;
        }
        .filter3{
            findByCategory;
        }
        .filter4{
            findAll;
        }

service{

        method1{
            create;
        }
        method2{
            read;
        }
        method3{
            update;
        }
        method4{
            delete;
        }

        .filter1{
            findById;
        }
        .filter2{
            findByDate;
        }
        .filter3{
            findByCategory;
        }
        .filter4{
            findAll;
        }
}

interface Registration{
        Scanner scan = new Scanner();
        Регистрация пользователя;
        Ввод данных({id, дата}, операция, тип, сумма);
}



Логика создания аккаунта:
- для конкретного пользователя запрашиваем данные о новом счете, 
- проверяем эти данные
- создаем ноый счет и добавляем его в AccountRepository и коллекцию счетов User

вариант 1 -> вызвать USerService -> AccountService в котором получить данные для создания счета, проверить
их правильность, вызвать репозиторий - созранить аккаунт - вернуть его в сервис и далее вернуть в UserService

вариант 2 -> отдельный сервис которому для работы нужно передать UserService (чтобы проверить по userId что такой пользователь есть)
+ передать AccountService 