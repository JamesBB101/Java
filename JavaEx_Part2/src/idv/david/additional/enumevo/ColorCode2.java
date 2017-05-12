package idv.david.additional.enumevo;

public enum ColorCode2 {
	R("紅色"), // 列舉子 物件
	B("黑色"), G("綠色"), U("未定");

	private final String name;

	private ColorCode2(String name) { // 建構子
		this.name = name; // 列舉子屬性
	}

	public String getName2() {
		return name;
	}
}
