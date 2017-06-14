package br.com.rafaeldev.redis.exemplo1;

import redis.clients.jedis.Jedis;

public class Echo {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		String resultado = jedis.echo("ola redis!");
		
		System.out.println(resultado);
  }
}
