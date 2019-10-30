package com.itwill.student;

public class Student {
	private int no;
	private String name;
	private String address;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int no, String name, String address, int kor, int eng, int math) {
		super();
		this.no = no;
		this.name = name;
		this.address = address;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Student(String name, String address, int kor, int eng, int math) {
		super();
		this.name = name;
		this.address = address;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	
}
