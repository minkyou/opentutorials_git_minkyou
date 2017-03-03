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
		mabang[x][y] = 1;		// ����1
		
		// Ȧ�� ������
		if(size%2 == 1) {
			for (int num = 2; num <= size*size; num++) {
				// ����2 : �̵�
				x-=1; 
				y-=1;
				
				// �̵��� �� ���� ����
				if(x < 0 && y >= 0) {					// ����3
					x+=size;
					
					if(mabang[x][y] == 0) {
						mabang[x][y] = num;
					}
					else if(mabang[x][y] != 0) {		// ����6
						x+=2;
						y+=1;
						mabang[x][y] = num;
					}
				}
				else if(x >= 0 && y < 0) {				// ����4
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
				else if(x < 0 && y < 0) {				// ����5
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
		
			// ���
			for(int[] i:mabang) {
				for(int j:i) {
					System.out.print(j+"\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("Ȧ���� �Է�");
		}
	}
	
	// start() START
	public void start() {
		mabang =  new int[size][size];
		x = 0;
		y = size/2;
		mabang[x][y] = 1;		// ����1
		
		// Ȧ�� ������
		if(size%2 == 1) {
			for (int num = 2; num <= size*size; num++) {
				// ����2 : �̵�
				x-=1; 
				y-=1;
				
				// �̵��� �� ���� ����
				if(x < 0 && y >= 0) {					// ����3
					x+=size;
					
					if(mabang[x][y] == 0) {
						mabang[x][y] = num;
					}
					else if(mabang[x][y] != 0) {		// ����6
						x+=2;
						y+=1;
						mabang[x][y] = num;
					}
				}
				else if(x >= 0 && y < 0) {				// ����4
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
				else if(x < 0 && y < 0) {				// ����5
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
		
			// ���
			for(int[] i:mabang) {
				for(int j:i) {
					System.out.print(j+"\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("Ȧ���� �Է�");
		}
	}
	// start() END
	
	public void maBangJinAnother(int size) {
		
		mabang =  new int[size][size];
		x = 0;
		y = size/2;
		mabang[x][y] = 1;		// ����1
		
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
		// ���
		for(int[] i:mabang) {
			for(int j:i) {
				sum+=j;
				System.out.print(j+"\t");
			}
			System.out.println("��:"+sum);
			sum=0;
		}
	}
	
	// maBangJinRevision START
	 void maBangJinRevision(int size) {
		
		mabang =  new int[size][size];
		x = 0;
		y = size/2;
		mabang[x][y] = 1;		// ����1
		
		// Ȧ�� ������
		if(size%2 == 1) {
			for (int num = 2; num <= size*size; num++) {
				// ����2 : �̵�
				x-=1; 
				y-=1;
				
				// �̵��� �� ���� ����
				if(x < 0) {					// ����3
					if(y >= 0) {
						x+=size;
					} else {
						x+=2;					// ����5
						y+=1;
					}
				} else {						// ����4
					if(y < 0) {
						y+=size;
					} else {					// x>=0 && y>=0
						if(mabang[x][y] != 0) {		// ����6
							x+=2;
							y+=1;
						}
					}
				}
				mabang[x][y] = num;
			}
		
			// ���
			for(int[] i:mabang) {
				for(int j:i) {
					System.out.print(j+"\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("Ȧ���� �Է�");
		}
	}
	// maBangJinRevision END
}
