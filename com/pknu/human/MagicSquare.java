package com.pknu.human;

public class MagicSquare {
	int[][] mabang;
	int first;
	int x, y;
	int size;
	
	public void maBangJin(int size) {
		
		mabang =  new int[size][size];
		x = 0;
		y = size/2;
		mabang[x][y] = 1;		// 조건1
		
		// 홀수 마방진
		if(size%2 == 1) {
			for (int num = 2; num <= size*size; num++) {
				// 조건2 : 이동
				x-=1; 
				y-=1;
				
				// 이동한 후 조건 조사
				if(x < 0 && y >= 0) {					// 조건3
					x+=size;
					
					if(mabang[x][y] == 0) {
						mabang[x][y] = num;
					}
					else if(mabang[x][y] != 0) {		// 조건6
						x+=2;
						y+=1;
						mabang[x][y] = num;
					}
				}
				else if(x >= 0 && y < 0) {				// 조건4
					y+=size;
					
					if(mabang[x][y] == 0) {
						mabang[x][y] = num;
					}
					else if(mabang[x][y] != 0) {
						x+=2;
						y+=1;
						mabang[x][y] = num;
					}
				}
				else if(x < 0 && y < 0) {				// 조건5
					x+=2;
					y+=1;
					
					if(mabang[x][y] == 0) {
						mabang[x][y] = num;
					}
					else if(mabang[x][y] != 0) {
						x+=2;
						y+=1;
						mabang[x][y] = num;
					}
				}
				else {
					if(mabang[x][y] == 0) {
						mabang[x][y] = num;
					}
					else if(mabang[x][y] != 0) {
						x+=2;
						y+=1;
						mabang[x][y] = num;
					}
				}
			}
		
			// 출력
			for(int[] i:mabang) {
				for(int j:i) {
					System.out.print(j+"\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("홀수만 입력");
		}
	}
	
	// start() START
	public void start() {
		mabang =  new int[size][size];
		x = 0;
		y = size/2;
		mabang[x][y] = 1;		// 조건1
		
		// 홀수 마방진
		if(size%2 == 1) {
			for (int num = 2; num <= size*size; num++) {
				// 조건2 : 이동
				x-=1; 
				y-=1;
				
				// 이동한 후 조건 조사
				if(x < 0 && y >= 0) {					// 조건3
					x+=size;
					
					if(mabang[x][y] == 0) {
						mabang[x][y] = num;
					}
					else if(mabang[x][y] != 0) {		// 조건6
						x+=2;
						y+=1;
						mabang[x][y] = num;
					}
				}
				else if(x >= 0 && y < 0) {				// 조건4
					y+=size;
					
					if(mabang[x][y] == 0) {
						mabang[x][y] = num;
					}
					else if(mabang[x][y] != 0) {
						x+=2;
						y+=1;
						mabang[x][y] = num;
					}
				}
				else if(x < 0 && y < 0) {				// 조건5
					x+=2;
					y+=1;
					
					if(mabang[x][y] == 0) {
						mabang[x][y] = num;
					}
					else if(mabang[x][y] != 0) {
						x+=2;
						y+=1;
						mabang[x][y] = num;
					}
				}
				else {
					if(mabang[x][y] == 0) {
						mabang[x][y] = num;
					}
					else if(mabang[x][y] != 0) {
						x+=2;
						y+=1;
						mabang[x][y] = num;
					}
				}
			}
		
			// 출력
			for(int[] i:mabang) {
				for(int j:i) {
					System.out.print(j+"\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("홀수만 입력");
		}
	}
	// start() END
	
	public void maBangJinAnother(int size) {
		
		mabang =  new int[size][size];
		x = 0;
		y = size/2;
		mabang[x][y] = 1;		// 조건1
		
		for(int num=2; num<=size*size; num++) {
			x-=1;
			y-=1;
			
			if(x<0) {
				if(y>=0) {
					x+=size;
				} else {
					x+=2;
					y+=1;
				}
			} else {		// x>=0
				if(y<0) {
					y+=size;
				} else {
					if(mabang[x][y]!=0) {
						x+=2;
						y+=1;
					}
				}
			}
			mabang[x][y]=num;
		}
		
		int sum=0;
		// 출력
		for(int[] i:mabang) {
			for(int j:i) {
				sum+=j;
				System.out.print(j+"\t");
			}
			System.out.println("합:"+sum);
			sum=0;
		}
	}
	
	// maBangJinRevision START
	 void maBangJinRevision(int size) {
		
		mabang =  new int[size][size];
		x = 0;
		y = size/2;
		mabang[x][y] = 1;		// 조건1
		
		// 홀수 마방진
		if(size%2 == 1) {
			for (int num = 2; num <= size*size; num++) {
				// 조건2 : 이동
				x-=1; 
				y-=1;
				
				// 이동한 후 조건 조사
				if(x < 0) {					// 조건3
					if(y >= 0) {
						x+=size;
					} else {
						x+=2;					// 조건5
						y+=1;
					}
				} else {						// 조건4
					if(y < 0) {
						y+=size;
					} else {					// x>=0 && y>=0
						if(mabang[x][y] != 0) {		// 조건6
							x+=2;
							y+=1;
						}
					}
				}
				mabang[x][y] = num;
			}
		
			// 출력
			for(int[] i:mabang) {
				for(int j:i) {
					System.out.print(j+"\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("홀수만 입력");
		}
	}
	// maBangJinRevision END
}
