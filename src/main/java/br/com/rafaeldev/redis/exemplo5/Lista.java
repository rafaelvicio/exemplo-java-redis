package br.com.rafaeldev.redis.exemplo5;

public class Lista {
	
	String chave = "ultimas_paginas_visitadas";
	String[] paginasVisitadas = {
		"/inicio",
		"/contato",
		"/sobre",
		"/todos",
		"/redis"
	};
	
	Jedis jedis = new jedis("localhost");
	Long resultado = jedis.lpush(chave, paginasVisitadas);
	
	System.out.println(String.format("A lista %s contém %d elementos", chave, resultado));
	
	

}
