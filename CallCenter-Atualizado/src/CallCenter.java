import java.util.concurrent.Semaphore;

public class CallCenter {
	
	Semaphore t1 = new Semaphore(1);
	Semaphore t2 = new Semaphore(1);
	Semaphore t3 = new Semaphore(1);
	Semaphore t4 = new Semaphore(1);
	Semaphore t5 = new Semaphore(1);
	
	public void ligacao(String name) {
		
		int aux =1 + (int) (Math.random() * (6 - 1)); // Gerar numero aleatorio pra ser o atendente
		switch(aux){
			case 1:
			try {
				t1.acquire();
				System.out.println("Atendente 1 recebeu a ligacao: "+name);
				System.out.println("##### LINHA ATENDENTE 1 -> status: OCUPADO\n");
				Thread.sleep( (int) ((Math.random() * (6 - 1)) + 1) * 1000);
				System.out.println("Atendente 1 -> Ligacao concluida com o "+name);
				System.out.println("##### LINHA ATENDENTE 1 -> status: DISPONIVEL\n");
				
				t1.release();
			} catch (InterruptedException e) {
			}
			break;
			
			case 2:
			try {
				t2.acquire();
				System.out.println("Atendente 2 recebeu a ligacao: "+name);
				System.out.println("##### LINHA ATENDENTE 2 -> status: OCUPADO\n");
				Thread.sleep( (int) ((Math.random() * (6 - 1)) + 1) * 1000);
				System.out.println("Atendente 2 -> Ligacao concluida com o "+name);
				System.out.println("##### LINHA ATENDENTE 2 -> status: DISPONIVEL\n");
				t2.release();
			} catch (InterruptedException e) {
			}
			break;

			case 3:
			try {
				t3.acquire();
				System.out.println("Atendente 3 recebeu a ligacao: "+name);
				System.out.println("##### LINHA ATENDENTE 3 -> status: OCUPADO\n");
				Thread.sleep( (int) ((Math.random() * (6 - 1)) + 1) * 1000);
				System.out.println("Atendente 3 -> Ligacao concluida com o "+name);
				System.out.println("##### LINHA ATENDENTE 3 -> status: DISPONIVEL\n");
				t3.release();
			} catch (InterruptedException e) {
			}
			break;

			case 4:
			try {
				t4.acquire();
				System.out.println("Atendente 4 recebeu a ligacao de usuario: "+name);
				System.out.println("##### LINHA ATENDENTE 4 -> status: OCUPADO\n");
				Thread.sleep( (int) ((Math.random() * (6 - 1)) + 1) * 1000);
				System.out.println("Atendente 4 -> Ligacao concluida com o "+name);
				System.out.println("##### LINHA ATENDENTE 4 -> status: DISPONIVEL\n");
				t4.release();
			} catch (InterruptedException e) {
			}
			break;

			default:
			try {
				t5.acquire();
				System.out.println("Atendente 5 recebeu a ligacao de usuario: "+name);
				System.out.println("##### LINHA ATENDENTE 5 -> status: OCUPADO\n");
				Thread.sleep( (int) ((Math.random() * (6 - 1)) + 1) * 1000);
				System.out.println("Atendente 5 -> Ligacao concluida com o "+name);
				System.out.println("##### LINHA ATENDENTE 5 -> status: DISPONIVEL\n");
				t5.release();
			} catch (InterruptedException e) {
			}
			
		}
	}
}

