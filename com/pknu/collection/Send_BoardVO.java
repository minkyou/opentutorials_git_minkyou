package com.pknu.collection;

import java.util.ArrayList;

public class Send_BoardVO {
	Receive_BoardVO rb;
	ArrayList<BoardVO> articleList;
	BoardVO article;
	int time;
	
	public void send(){
		articleList = new ArrayList<>();
		while(time<10){
			article= new BoardVO();			
			article.setArticle_num(time);
			article.setId("a");
			article.setContent("��Ƴ���?");
			article.setTitle("��������");
			articleList.add(article);
			time++;			
		}
		rb= new Receive_BoardVO();
		rb.receive(articleList);		
	}
}
