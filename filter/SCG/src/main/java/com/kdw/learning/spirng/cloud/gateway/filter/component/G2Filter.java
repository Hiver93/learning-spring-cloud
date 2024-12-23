package com.kdw.learning.spirng.cloud.gateway.filter.component;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class G2Filter implements GlobalFilter, Ordered {

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return -2;
	}

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		System.out.println("pre global filter order -2");
		return chain.filter(exchange)
				.then(Mono.fromRunnable(()->{
					System.out.println("Post global filter order -2");
				}));
	}
}
