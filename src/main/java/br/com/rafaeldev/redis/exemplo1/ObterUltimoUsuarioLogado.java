package br.com.rafaeldev.redis.exemplo1;

import redis.clients.jedis.Jedis;

public class ObterUltimoUsuarioLogado {

	public static void main(String[] args) {

		Jedis jedis = new Jedis("localhost");
		String valor = jedis.get("ultimo_usuario_logado");

		System.out.println(valor);
	}
}
