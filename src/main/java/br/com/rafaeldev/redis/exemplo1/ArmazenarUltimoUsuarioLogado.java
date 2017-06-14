package br.com.rafaeldev.redis.exemplo1;

import redis.clients.jedis.Jedis;

public class ArmazenarUltimoUsuarioLogado {

	public static void main(String[] args) {

		Jedis jedis = new Jedis("localhost");
		String resultado = jedis.set("ultimo_usuario_logado", "Tony Stark");

		System.out.println(resultado);
	}
}
