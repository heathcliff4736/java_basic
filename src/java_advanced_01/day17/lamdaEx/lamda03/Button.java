package java_advanced_01.day17.lamdaEx.lamda03;

public class Button {
    // 정적 멤버 인터페이스 (클래스의 이너클래스로 인터페이스도 가능)
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }

    public static void main(String[] args) {
        Button buttonOk = new Button();

        // Ok 버튼 객체에 람다식 주입
        buttonOk.setClickListener(
                ()->{
                    System.out.println("Ok버튼 클릭");
                }
        );


        
        // Ok버튼 클릭
        buttonOk.click();

        // Cancle 버튼 객체 생성
        Button buttonCancel = new Button();
        buttonCancel.setClickListener(()->System.out.println("Cancel버튼 클릭"));
        for (int i = 0; i < 5; i++) {
            buttonCancel.click();
        }
        // 하나의 컴포넌트는 단일한 하나의 기능을 수행하여야한다.
        
        
    }
}
