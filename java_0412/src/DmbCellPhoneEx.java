public class DmbCellPhoneEx {
  public static void main(String[] args) {
    DmbCellPhone dmbCellPhone = new DmbCellPhone("갤럭시", "검정", 10);

    System.out.println("모델 : " + dmbCellPhone.model );
    System.out.println("색상 : " + dmbCellPhone.color );
    System.out.println("채널 : " + dmbCellPhone.channel );

    dmbCellPhone.powerOn();
    dmbCellPhone.bell();
    dmbCellPhone.sendVoice("여보세요");
    dmbCellPhone.receiveVoice("안녕하세요! 저는 똥인데요..");
    dmbCellPhone.sendVoice("나는 징징이야...");
    dmbCellPhone.hangUp();

    dmbCellPhone.turnOnDmb();
    dmbCellPhone.changeChannelDmb(12);
    dmbCellPhone.turnOffDmb();

    dmbCellPhone.powerOff();
  }
}
