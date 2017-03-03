package com.pknu.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Receive_BoardVO {
	BoardVO article;
	public void receive(ArrayList<BoardVO> articleList){		
//		Iterator<BoardVO> it=articleList.iterator();
//		System.out.println("여기는 Iterator사용");
//		while(it.hasNext()){			
//			article=it.next();
//			System.out.print(article.getArticle_num()+" ");
//			System.out.print(article.getId()+" ");
//			System.out.print(article.getTitle()+" ");
//			System.out.println(article.getContent());			
//		}
		System.out.println("여기는 향상된 for사용");
		for(BoardVO ar:articleList){			
			System.out.print(ar.getArticle_num()+" ");
			System.out.print(ar.getId()+" ");
			System.out.print(ar.getTitle()+" ");
			System.out.println(ar.getContent());
		}
		
	}

}
