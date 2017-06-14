package br.com.rafaeldev.redis.exemplo3;

public class getHashes {
	
	String chave = "resultado:09-11-2013:megasena";
	Jedis jedis = new Jedis("localhost");
	
	String ganhadores = jedis.hget(chave, "ganhadores");
	String numeros = jedis.hget(chave, "numeros");
	
	String mensagem = String.format("Gahadores = %s, Numeros = [%s]", ganhadores, numeros);
	
	System.out.println(mensagem);

}
