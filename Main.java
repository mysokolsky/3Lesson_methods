// Я участвую в проекте возрождения всего Человечества - Созидательное Общество! 
// Присоединяйся, если ты за добро: https://creativesociety.com/ru/

//Автор кода:
//Сокольский Михаил
//+7 926 8645511
//mysokolsky@gmail.com



// Домашнее задание №3

class Main {


  public static void main(String[] args) {
    
    
    System.out.println();

    firstExercise();
    secondExercise();


  }

  public static void firstExercise() {
  
    // 1) Переписать задачу на квадратное уравнение выделив отдельные статические методы для вычисления дискриминанта и расчета корней

    System.out.println();
    System.out.println();
    System.out.println("Решим квадратное уравнение");
    System.out.println();

    float a = 2F;
    float b = -5F;
    float c = 0F;

    float D = findDiscriminant(a,b,c);   // вызов метода нахождения Дискриминанта

    if (D > 0F) {               
      roots_X1_X2(a, b, D);         // вызов метода нахождения 2х корней
    }
        
    if (D == 0F) {
      root_X(a, b);             // вызов метода нахождения 1 корня
    }
    
    if (D<0F) {
      no_roots();           // вызов метода без корней
    } 
  }


  public static float findDiscriminant(float a, float b, float c){
    float D = (b*b - 4*a*c);
    return D;
  }

  public static void roots_X1_X2(float a, float b, float D){
    System.out.println("Уравнение имеет 2 корня:");
    double x1 = (-b + Math.sqrt(D)) / (2 * a);
    double x2 = (-b - Math.sqrt(D)) / (2 * a);
    System.out.println("x1 = " + x1);
    System.out.println("x2 = " + x2);
  }

  public static void root_X(float a, float b){
    float x=(-b / (2 * a));
    System.out.println("Уравнение имеет 1 корень = " + x);
  }

  public static void no_roots(){
    System.out.println("Уравнение не имеет решения");
  }
    


  public static void secondExercise() {

    // 2) Написать статические методы:
    


    // - взятия факториала некоторого числа
  
    System.out.println();

    int n=5;

    int f = mFactorial(n);

    System.out.println("Факториал числа " + n + " равен: " + f);



    // найдём число x в степени y

    System.out.println();

    float x=1.01F;
    int y=365;

    float e = mExponentiation(x,y);

    System.out.println("Число " + x + " в степени "+ y + " равно: " + e);

    
  }

  public static int mFactorial(int n) {   //поиск факториала числа
    int result = 1;
    for (int i=1; i<=n; i++) {
      result *= i;
    }
    return result;
  }

  public static float mExponentiation(float x,int y) {  // возведение в степень
    float result = 1F;
    for (int i=1; i<=y; i++) {
      result *= x;
    }
    return result;
  }



}