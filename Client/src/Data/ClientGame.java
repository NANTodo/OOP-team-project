package Data;

public class ClientGame {
	/*방번호,GameeAccount<상대방의 카드,우선권,기본칩갯수>를 가지고 있고 마지각으로 유형별로 
	 * 처리하기 위한 type가 있다
	 * */
	private String		roomnumber;
	private GameAccount	account;
	private String		type;

	public String getType() {
		return type;
	}

	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ClientGame() {

	}

	public GameAccount getAccount() {
		return account;
	}

	public void setAccount(GameAccount account) {
		this.account = account;
	}

	public ClientGame(String roomnumber, GameAccount account, String type) {
		this.roomnumber	= roomnumber;
		this.account	= account;
		this.type		= type;
	}

	public String getRoomnumber() {
		return roomnumber;
	}
}