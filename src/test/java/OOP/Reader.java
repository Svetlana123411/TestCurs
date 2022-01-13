package OOP;

public class Reader {
    String ПІБ;
    int numberCart;
    String numberPhone;

    public Reader(String ПІБ) {
        this.ПІБ = ПІБ;
    }

    public void takeBooks(int numberBooksTaked, int numberBooksNeed) {

        int a = numberBooksTaked;
        int b = numberBooksNeed;
        if (a + b > 5) {
            System.out.println("Читач- " + ПІБ + " взяв сьогодні " + a + " книжок." + "\n" +
                    "Всього читач отримав- " + (a + b) + ";" + "\n" + "Ліміт перевищений. Сума штрафу :" + (a + b - 5) * 50 + ";");
                } else {
            System.out.println("Читач " + ПІБ + " взяв сьогодні " + a + " книжок." +
                    "Всього читач отримав " + (a + b));


        }
    }
        public void reternBooks( int numberBooksTake, int numberBooksReturn ){
            int a = numberBooksTake;
            int b = numberBooksReturn;
            if (a > 5 && a - b > 5) {
                System.out.println("Читач- " + ПІБ + " тримав (ла) всього " + a + " книжок." + "\n" +
                        "Оплатіть, будь ласка , за переліміт " + (a - b) * 50 + "\n" +
                        "Повернув (ла) книжок :" + b + ":" + "\n" + " " +
                        "Увага! Терміново поверніть ще " + (a - b - 5) + " книги" + " Ваш майбутній штраф  : " + (a - b - 5) * 50);
            }
            if (a > 5 && a - b < 5) {
                System.out.println("Читач- " + ПІБ + " взяв всього " + a + " книжок." + "\n" +
                        "Оплатіть, будь ласка , за переліміт :" + (a - b) * 50 + "\n" +
                        "Повернув (ла) книжок :" + b + ":" + "\n" +
                        "У Вас залишилося " + (a - b) + "книжок, поверніть їх вчасно!");
            } else if (a <= 5) {
                System.out.println(" Читач повернув (ла) книжок :" + b + "\n" +
                        "Дякуємо, що скористалися нашою бібліотекою ");
            }
        }
    }


