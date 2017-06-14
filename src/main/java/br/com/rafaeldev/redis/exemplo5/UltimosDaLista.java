package br.com.rafaeldev.redis.exemplo5;

public class UltimosDaLista {
	
	String chave = "ultimas_paginas_visitadas";
	Jedis jedis = new Jedis("localhost");
	List<String> paginas = jedis.lrange(chave, 0, 2);
	
	System.out.println("As 3 ultimas paginas visitadas são: ");
	
	for (String pagina: paginas){
		System.out.println(pagina);
	}
}
