package util;

import com.alibaba.fastjson2.util.JSONObject1O;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import entity.Actress;
import org.json.JSONObject;
import com.google.gson.Gson;
import org.yaml.snakeyaml.Yaml;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author by PIG
 * 2022/10/10 14
 */
public class JedisDBPool {

	public static JedisPool jedisPool;

	static {
		InputStream resourceAsStream = JedisDBPool.class.getClass().getClassLoader().getResourceAsStream("redis.yml");
		HashMap yml = new Yaml().loadAs(resourceAsStream, HashMap.class);
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		Gson gson = new Gson();
		JsonObject ymlJson = gson.toJsonTree(yml).getAsJsonObject();
//		jsonObject.get
		jedisPool = new JedisPool(jedisPoolConfig, ymlJson.get("host").getAsString(), ymlJson.get("port").getAsInt());
	}

	public static Jedis getConnectJedis() {
		return jedisPool.getResource();
	}
}
