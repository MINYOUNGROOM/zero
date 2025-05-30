// Java 프로그래밍 - 변수와 자료형_1


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

//      1. 변수 사용하기
        System.out.println("== 변수 사용하기 ==");
        int age = 10;
        System.out.println(age);
        String country = "Korea";
        System.out.println(country);

//      2. 변수 이름 규칙
        System.out.println("== 변수 이름 규칙 ==");
//      2-1. 문자, 숫자, _(underscore), $ 사용 가능
        int apple = 2000;
        int apple3 = 2000;
        int _apple = 2000;
        int $apple = 2000;
        System.out.println(apple);
        System.out.println("#apple = " + $apple);

//      2-2. 숫자로 시작 X
//        int 3apple = 2000;

//      2-3. 대소문자 구분

//      2-4. 공백 사용 X

//      2-5. 예약어 사용 X
//      예약어 예시: true, false, if, switch, for, continue, break, ...
//        int true = 1;
//      참고) 한글 사용 가능


//      3. 표기법
//      3-1. 카멜 표기법 (camelCase)
//      변수, 함수


//      3-2. 파스칼 표기법 (PascalCase)
//      클래스


//      참고) 스네이크 표기법 (snake_case)
//      사용 X

        //===============================================================================
//      1. 자료형 - 숫자
        System.out.println("== 숫자 ==");
//      1-1. 정수

//      1-2. 실수

//      1-3. 2진수 / 8진수 / 16진수


//      2. 자료형 - 부울
        System.out.println("== 부울 ==");


//      3. 자료형 - 문자
        System.out.println("== 문자 ==");


        //===============================================================================
        //      1. 자료형 - 문자열
        System.out.println("== 문자열 ==");
        String s1 = "Hello world";
        System.out.println(s1);
        String s2 = "0123";
        System.out.println(s2);

//      1-1. equals
        String s3 = "HI";
        String s4 = "HI";
        System.out.println("s3.equals(s4) : " + s3.equals(s4)); // true
        String s5 = new String("HI");
        System.out.println("s3.equals(s4) : " + s3.equals(s5)); // true
        System.out.println("s3.equals(s4) : " + s3 == s5); // false

        // == 는 주소값을 비교
        // equals 는 문자를 비교


//      1-2. indexOf
        String s6 = "Hello World!";
        System.out.println(s6.indexOf("!"));

//      1-3. replace


//      1-4. substring


//      1-5. toUpperCase


//      2. 자료형 - StringBuffer
        System.out.println("== StringBuffer ==");


//      3. 자료형 - 배열
        System.out.println("== 배열 ==");

        int[] myArray1 = {1, 2, 3, 4, 5};
        System.out.println(myArray1[0]);
        System.out.println(myArray1[3]);
        System.out.println(myArray1[4]);

        String[] makeArray = new String[3];
        makeArray[0] = "Hello";
        makeArray[1] = " ";
        makeArray[2] = "World!";

        System.out.println(makeArray[0] + makeArray[1] + makeArray[2]);


        //===============================================================================

//      1. 자료형 - 리스트
        System.out.println("== 리스트 ==");
        ArrayList l1 = new ArrayList();

//      1-1. add
        l1.add(1);
        l1.add("hello");
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add("world!");
        System.out.println("l1 = " + l1);

        l1.add(0, 1);
        System.out.println("l1 = " + l1);
//      1-2. get

        System.out.println(l1.get(0));
        System.out.println(l1.get(2));

//      1-3. size
        System.out.println(l1.size());

//      1-4. remove
        System.out.println(l1.remove(0));
        System.out.println("l1 = " + l1);

        System.out.println(l1.remove(Integer.valueOf("1")));
        System.out.println("l1 = " + l1);

//      1-5. clear
        l1.clear();
        System.out.println("l1 = " + l1);

//      1-6. sort
        ArrayList l2 = new ArrayList();
        l2.add(6);
        l2.add(7);
        l2.add(5);
        System.out.println("l2 =" + l2);

        l2.sort(Comparator.naturalOrder());
        System.out.println("l2 =" + l2);
        l2.sort(Comparator.reverseOrder());
        System.out.println("l2 =" + l2);

//      1-7. contains
        System.out.println(l2.contains(1));
        System.out.println(l2.contains(6));


//      2. Maps -- 순서 보장이 x
        System.out.println("== Maps ==");
        HashMap map = new HashMap();


//      2-1. put
        map.put("kiwi", 9000);
        map.put("apple", 5000);
        map.put("mango", 4000);
        System.out.println("map" + map);


//      2-2. get
        System.out.println(map.get("madarin")); // null
        System.out.println(map.get("kiwi")); // 9000

//      2-3. size
        System.out.println(map.size());

//      2-4. remove
        System.out.println(map.remove("kiwi"));
        System.out.println(map.remove("madarin")); // null

//      2-5. containsKey
        System.out.println(map.containsKey("apple"));
        System.out.println(map.containsKey("kiwi"));


//      3. Generics
        System.out.println("== Generics ==");
        ArrayList l3 = new ArrayList();

        l3.add("hello");
        l3.add(3);
        System.out.println("l3 :" + l3);

        ArrayList<String> l4 = new ArrayList<String>();
//        l4.add(1);   --  1을 넣으면 에러가 나는 이유는 제네릭으로 Stirng 타입으로 한정해두었기 때문이다.
        System.out.println(l4.add("문자열만 가능"));
        System.out.println(l4.get(0));

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("blueberry", 9000);
        System.out.println("map2=" + map2);

        //===============================================================================

//      6. 삼항 연산자
        System.out.println("== 삼항 연산자 ==");
        int a = 100;
        String aResult = (a == 100) ? "yes" : "no";
        System.out.println("aResult = " + aResult);

        //===============================================================================


//      1. 비트 논리 연산자
        System.out.println("== 비트 논리 연산자 ==");
//      1-1. AND 연산자 (&) -- 두 개의 비트 값이 모두 1인 경우에만 결과 1
        int num1 = 5;
        int num2 = 3;
        int result = 0;

        result = num1 & num2;
        System.out.println("result = " + result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

//      1-2. OR 연산자 (|) -- 두 개의 비트 값 중 하나라도 1이면 결과 1
        result = num1 | num2;
        System.out.println("result = " + result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

//      1-3. XOR 연산자 (^) -- 두 개의 비트 값이 같으면 0, 다르면 1
        result = num1 ^ num2;
        System.out.println("result = " + result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

//      1-4. 반전 연산자 (~) -- 비트 값이 0이면 1로 , 1이면 0으로 반전
        num1 = 5;
        result = ~num1;
        System.out.println("result = " + result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%s\n", Integer.toBinaryString(result));


//      2. 비트 이동 연산자
        System.out.println("== 비트 이동 연산자 ==");
//      2-1. << 연산자 -- 비트를 왼쪽으로 이동 뒤 숫자만큼 0을 붙힌다
        int numA = 3;
        result = numA << 1;

        System.out.println("result = " + result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(numA)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

//      2-2. >> 연산자 -- 비트를 오른쪽인 것을 숫자만큼 0을 삭제시킨다
        result = numA >> 1;
        System.out.println("result = " + result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(numA)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

//      2-3. >>> 연산자 -- 부호 비트 상관 없이 0으로 채움
        numA = -5;
        result = numA >> 1;
        System.out.printf("%s\n", Integer.toBinaryString(numA));
        System.out.printf("%s\n", Integer.toBinaryString(result));

        result = numA >>> 1;
        System.out.printf("%s\n", Integer.toBinaryString(numA));
        System.out.printf("%s\n", Integer.toBinaryString(result));


//      1. 반복문 - for
        System.out.println("== for ==");
//      1-1. 기본 사용 방법


//      1-2. for each


//      2. 반복문 - while
        System.out.println("== while ==");
//      2-1. while


//      2-2. do-while


//      Q1. 아래와 같은 출력 결과를 반복문과 조건문을 이용하여 출력해보세요.
//      *
//      ***
//      *****
//      *******
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) // 짝수일 때는 출력을 안 하고 ~ 홀수일 때만 출력을 할 수 있도록
                continue;
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


//      Q2. 반복문을 실행할 때마다 물 온도를 1도씩 올리고 100도가 되면 종료한다.
//          추가로, 10도, 20도, ... 10도 간격으로 물 온도를 출력하시오.
        int waterTemperature = 0;
        for (int i = 0; i < 100; i++) {
            waterTemperature++;  // ** 이 과정을 놓침 **
            if (waterTemperature % 10 == 0) {              // waterTemperature 을 어떻게 해야 10의 배수라는 걸 뜻할까
                System.out.println(waterTemperature + "도 입니다.");
            }
        }


//      Q1. 아래와 같이 3x3 행렬이 2차원 배열로 초기화 되어있다.
//          모든 원소를 1로 변경하고, 대각 원소는 10으로 변경하시오.
        int [][] testArray1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < testArray1.length; i++) {
            for (int j = 0; j < testArray1[i].length ; j++) {
                testArray1[i][j] = 1;

                if(i == j){
                    testArray1[i][j] = 10;
                }
            }

            for(int[] temp : testArray1){
                for(int ed : temp){
                    System.out.print(ed + " ");
                }
                System.out.println();
            }
        }
//            int [][] testArray2 ={{1,1,1},{1,1,1},{1,1,1}};
//                for (int[] array : testArray2){
//                    int x;
//                    int y;
//                    if(int[x] == int[y]){
//                        int x = 10;
//                        int y =10;
//                    }
//                    System.out.println("array" + Arrays.toString(array));
//                }
    }


}


