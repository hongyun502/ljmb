package com.web.ljmb.test;

public class Test {
	//1元1瓶
	static final int NUM=1;
	//2空瓶1瓶
	static final int BOTTLE=2;
	//3瓶盖1瓶
	static final int CAP=3;

	public static void main(String[] args) {
		System.out.println(getBottleNum(20));
	}
	
	//1块钱1瓶水 2个空瓶换一瓶水 3个瓶盖换一瓶水
	/**
	 * 输入钱数
	 * @param money
	 * @return
	 */
	public static int getBottleNum(int money){
		if(money<1) return 0;
		//1元的买了多少瓶
		int total=money/NUM;
		//产生的瓶子和瓶盖换的水瓶数  递归调用
		return total+getBottleCap(money/NUM,money/NUM);
	}
	
	//计算瓶子和瓶盖能换多少水
	public static int getBottleCap(int bottleNum,int capNum){
		if(bottleNum>=BOTTLE || capNum>= CAP){
			int totalNum =bottleNum/BOTTLE+ capNum/CAP;
			//新的空瓶数=空瓶换的水瓶数+剩余的空瓶数+瓶盖换的水的瓶数
			int tempBottle=bottleNum/BOTTLE+bottleNum%BOTTLE+capNum/CAP;
			//新的瓶盖数=瓶盖换的水瓶数+剩余的瓶盖数+空瓶换的水瓶数
			int tempCap = capNum/CAP +capNum%CAP+bottleNum/BOTTLE;
			//递归调用
			return totalNum+getBottleCap(tempBottle,tempCap);
		} 
		return 0;
	}

}
