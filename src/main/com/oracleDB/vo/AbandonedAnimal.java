package main.com.oracleDB.vo;

public class AbandonedAnimal {

	private int abAnimalCode; // Number
	private String abThumbPic; // URL
	private String abImage; // URL
	private String findDate; // Date, YYYYMMDD
	private String finLoc; // nvarchar2
	private int breedType; // Number
	private String abColor; // nvarchar2
	private String abAge; // nvarchar2
	private double abWeight; // number(,2)
	private String noticeNum; // nvarchar2
	private String noticeStartDate; // Date, YYYYMMDD
	private String noticeEndDate; // Date, YYYYMMDD
	private String abPic; // URL
	private String abState; // nvarchar2
	private int abSex; // number
	private String abFeat; // nvarchar
	private int shelterCode; // nvarchar2
	private String abComment; // nvarchar2
	private int roadNameCode; // number

	@Override
	public String toString() {
		return "AbandonedAnimal [abAnimalCode=" + abAnimalCode + ", abThumbPic=" + abThumbPic + ", abImage=" + abImage
				+ ", findDate=" + findDate + ", finLoc=" + finLoc + ", breedType=" + breedType + ", abColor=" + abColor
				+ ", abAge=" + abAge + ", abWeight=" + abWeight + ", noticeNum=" + noticeNum + ", noticeStartDate="
				+ noticeStartDate + ", noticeEndDate=" + noticeEndDate + ", abPic=" + abPic + ", abState=" + abState
				+ ", abSex=" + abSex + ", abFeat=" + abFeat + ", shelterCode=" + shelterCode + ", abComment="
				+ abComment + ", roadNameCode=" + roadNameCode + "]";
	}

	public int getAbAnimalCode() {
		return abAnimalCode;
	}

	public void setAbAnimalCode(int abAnimalCode) {
		this.abAnimalCode = abAnimalCode;
	}

	public String getAbThumbPic() {
		return abThumbPic;
	}

	public void setAbThumbPic(String abThumbPic) {
		this.abThumbPic = abThumbPic;
	}

	public String getAbImage() {
		return abImage;
	}

	public void setAbImage(String abImage) {
		this.abImage = abImage;
	}

	public String getFindDate() {
		return findDate;
	}

	public void setFindDate(String findDate) {
		this.findDate = findDate;
	}

	public String getFinLoc() {
		return finLoc;
	}

	public void setFinLoc(String finLoc) {
		this.finLoc = finLoc;
	}

	public int getBreedType() {
		return breedType;
	}

	public void setBreedType(int breedType) {
		this.breedType = breedType;
	}

	public String getAbColor() {
		return abColor;
	}

	public void setAbColor(String abColor) {
		this.abColor = abColor;
	}

	public String getAbAge() {
		return abAge;
	}

	public void setAbAge(String abAge) {
		this.abAge = abAge;
	}

	public double getAbWeight() {
		return abWeight;
	}

	public void setAbWeight(double abWeight) {
		this.abWeight = abWeight;
	}

	public String getNoticeNum() {
		return noticeNum;
	}

	public void setNoticeNum(String noticeNum) {
		this.noticeNum = noticeNum;
	}

	public String getNoticeStartDate() {
		return noticeStartDate;
	}

	public void setNoticeStartDate(String noticeStartDate) {
		this.noticeStartDate = noticeStartDate;
	}

	public String getNoticeEndDate() {
		return noticeEndDate;
	}

	public void setNoticeEndDate(String noticeEndDate) {
		this.noticeEndDate = noticeEndDate;
	}

	public String getAbPic() {
		return abPic;
	}

	public void setAbPic(String abPic) {
		this.abPic = abPic;
	}

	public String getAbState() {
		return abState;
	}

	public void setAbState(String abState) {
		this.abState = abState;
	}

	public int getAbSex() {
		return abSex;
	}

	public void setAbSex(int abSex) {
		this.abSex = abSex;
	}

	public String getAbFeat() {
		return abFeat;
	}

	public void setAbFeat(String abFeat) {
		this.abFeat = abFeat;
	}

	public int getShelterCode() {
		return shelterCode;
	}

	public void setShelterCode(int shelterCode) {
		this.shelterCode = shelterCode;
	}

	public String getAbComment() {
		return abComment;
	}

	public void setAbComment(String abComment) {
		this.abComment = abComment;
	}

	public int getRoadNameCode() {
		return roadNameCode;
	}

	public void setRoadNameCode(int roadNameCode) {
		this.roadNameCode = roadNameCode;
	}

}
