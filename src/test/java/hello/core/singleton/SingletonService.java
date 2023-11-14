package hello.core.singleton;

public class SingletonService {
  //1. static 영역에 객체를 딱 한개만 생성
  private static final SingletonService instance = new SingletonService();

  //2. public 으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용
  public static SingletonService getInstance() {
    return instance;
  }
  //3. 생성자를 private로 선언해서 외부의 new 키워드 사용 금지
  private SingletonService() {
  }

  public void logic() {
    System.out.println("싱글톤 객체 로직 호출");
  }
}
