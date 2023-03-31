package day07.mypac;

public class DanceMusic implements Music, Singer {

	private String genre;
	private String name;
	private String composer;
	private String writer;
	private String groupName;

	public DanceMusic() {
		this.genre = "dance";
		this.name = "캔디";
		this.composer = "홍길동";
		this.writer = "홍길동";
		this.groupName = "NCT DREAM";
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getWriter() {
		return writer;
	}
	


	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	@Override
	public void sing() {
		System.out.println("칼군무 와 노래를 불러요");

	}

	@Override // 어노테이션 - 부가정보 또는 추가기능 제공. 명시적으로 사용, 가독성 업
	public void listen() {
		System.out.println("신나는 노래와 함께 둠칫둠칫");

	}

	


}
