package aplication;

import java.util.Date;

import entities.Pedido;
import entities.enums.StatusPedido;

public class Programa {
	
	public static void main (String[] args) {
		
		Pedido pedido = new Pedido (1080, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);
		
		System.out.println(pedido);
		
		StatusPedido sp1 = StatusPedido.ENTREGUE;
		StatusPedido sp2 = StatusPedido.valueOf("ENTREGUE");
		
		System.out.println(sp1);
		System.out.println(sp2);
	}

}
