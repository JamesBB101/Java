package homework8;

public
class Train implements Comparable<Train>{
	int number;
	String type;
	String start;
	String dest;
	double price;

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStrat() {
		return start;
	}

	public void setStrat(String start) {
		start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public String show(){
		return "班次：" + number + ", 車種：" + type + ", 出發地：" + start + ", 目的地："
				+ dest + ", 票價：" + price;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((dest == null) ? 0 : dest.hashCode());
//		result = prime * result + number;
//		long temp;
//		temp = Double.doubleToLongBits(price);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		result = prime * result + ((start == null) ? 0 : start.hashCode());
//		result = prime * result + ((type == null) ? 0 : type.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Train other = (Train) obj;
//		if (dest == null) {
//			if (other.dest != null)
//				return false;
//		} else if (!dest.equals(other.dest))
//			return false;
//		if (number != other.number)
//			return false;
//		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
//			return false;
//		if (start == null) {
//			if (other.start != null)
//				return false;
//		} else if (!start.equals(other.start))
//			return false;
//		if (type == null) {
//			if (other.type != null)
//				return false;
//		} else if (!type.equals(other.type))
//			return false;
//		return true;
//	}
	@Override
	public int compareTo(Train t) {
		if(this.number>t.number){
			return -1;
		}else if(this.number==t.number){
			return 0;
		}else{
			return 1;
		}
	}
}