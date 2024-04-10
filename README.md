# Лабораторна робота №9
## Тема: Лямбда-вирази та компаратори
## Виконав(-ли): Макасєєва Марія Олексіївна, Горлач Дарʼя Дмитрівна, Соколова Поліна Сергіївна
---
### **Хід роботи:**
Використовуючи класи лабораторної роботи №8 першого семестру сортуємо за допомогою компараторів.
Для початку створюємо список з класів FoodProduct, потім отримаємо масив з нього для кожного прикладу із компаратором.
Перший приклад це сортування за назвою у вигляді лямбда-виразу.
Другий приклад це сортування за назвою у зворотному порядку, методом reversed.
Третій приклад це сортування за назвою, або якщо назви однакові, сортування за кількістю, використовуючи method reference, методом thenComparing.

Для четвертого прикладу додаємо null в список.
Четвертий приклад це сортування за назвою, але при цьому, першим/останнім буде null, використовуючи методі nullFirst|nullLast.

І використовуємо метод для відображення результату роботи в консоль printProducts.

### **Висновки:** 
Для коректного виконання лабораторної роботи, ми значення Null одразу не добавляємо, бо в нас немає обробки та порівняння на Null, якщо добавити перед обробленням, то будемо мати NullPointerException. Одразу перед виконанням останнього компаратора, ми добавляємо значення Null тому, що в цьому компараторі ми обробляємо Null. Результат сортування відрізняється залежно від методів які ми використовуємо, nullFirst|nullLast, ми будемо мати Null або спочатку або вкінці.   
```
