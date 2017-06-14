package br.com.rafaeldev.redis.exemplo2;

import br.com.rafaeldev.redis.exemplo1.Jedis;

public class Mega {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String chave = "resultado:megase";
		String numerosDoUlimoSorteio = "2, 13, 24, 41, 42, 44";
		
		Jedis jedis = new Jedis("localhost");
		String resultado = jedis.set(chave, numerosDoUlimoSorteio);
		
		System.out.println(resultado);

	}

}
