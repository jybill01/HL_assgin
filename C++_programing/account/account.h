#ifndef ACCOUNT_H
#define ACCOUNT_H

namespace Bank{
    class Account{
        private:
            string name;
            int balance;

        public:
            Account(string n, int bol);
            ~Account();
            void deposit(int money);
            int withdraw(int money);
            int check() const;
            string getOwner() const;
    };
    enum class MENU {
        DEPOSIT = 1, WITHDRAW, CHECK
    };
}

#endif