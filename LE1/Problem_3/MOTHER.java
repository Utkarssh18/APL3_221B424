class Mother {
    int x;
    static void show() {
        System.out.println("Hello world");
    }
}

// SCENARIO 1 IS TO MAKE SIMPLY A FUNCTION AND CALL IT : IT SIMPLY GIVE OUTPUT "hello juet"

// SCENARIO 2 IS TO MAKE static in mother class and CALL IT 
  // it give error "OVERRIDING METHOD IS STATIC"
  
// SCENARIO 3 IS TO MAKE static in CHILD class and CALL IT 
  // it give error "OVERRIDING METHOD IS STATIC"  
  
  // SCENARIO 4 IS TO MAKE static in both mother & child class  and then  CALL IT 
  // it give output "hello World"