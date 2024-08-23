[200~class producer{
	    int val=0;
	        void produce() throws InterruptedException {
			        while(true){
					            synchronized (this){
							                    System.out.println("Producer put " );
									                    val++;

											                    wait();
													                    Thread.sleep(100);


															                }
						            }
				    }
		    void Consumer() throws InterruptedException {
			            while(true){
					                synchronized (this){
								                System.out.println("Consumer get");
										                notify();
												                Thread.sleep(100);
														            }
							        }
				        }

}
