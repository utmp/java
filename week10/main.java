
interface window{
    int width = 1920;
    int height  = 1080;
}
interface titleBar{
    String closeBtn = "close button";
    String minimizeBtn = "minimize button";
    String maxmizeBtn = "maximize button";
}
class someApp implements window,titleBar{
    public void configureTitleBar(){
        System.out.printf("configured titlebar with these buttons: %s,%s,%s\n",closeBtn,minimizeBtn,maxmizeBtn);
    }
    public void openApp(){
        System.out.printf("Opening app with screen\n width: %dpx, screen height: %dpx",width,height);
    }
}

class main{
    public static void main(String[] args){
        someApp calculator = new someApp();
        calculator.configureTitleBar();
        calculator.openApp();
    }
}