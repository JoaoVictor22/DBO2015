package coco;

import java.util.Arrays;

public class List implements IList {
	
	private Object [] list = new Object [10];
	
	public List(){
		for (int i = 0; i < list.length; i++){
			list[i] = null;
		}
	}
	
	/**
	 * Adiciona o elemento no fim da lista.
	 * Parâmetros null são ignorados.
	 *
	 * @param o Elemento a ser adicionado
	 */
	
	
	public void append(Object o) {
		if (o != null) {
			boolean foder = false;
			for (int i = 0; i < list.length; i++) {
				if (list[i] == null){
					list[i] =0 ;
					foder = true;
				break;
				}
				if (foder == false) {
					Object [] list2 = new Object[list.length+10];
					int j;
					for (j = 0; j < list2.length; j++) {
					list2[i] = null;
					}
					for (j = 0; j < list.length; j++) {
						
						list2[j] = list[j];
						
					}
					list2[j] = o;
					list = list2;
						
					}
				}
			}
	}
	
	
	
	/**
	 * Obtém um elemento dado um índice.
	 * Índices não existentes retornam null.
	 *
	 * @param index Índice do objeto. Valores válidos são 0 <= index < count()
	 * @return Object Elemento no índice informado ou null se não houver.
	 */
	
	public Object get(int index){
		if(index >=0  && index < count()){
			return list[index];
		}
		return null;
	}
	
	/**
	 * Retorna o primeiro elemento da lista.
	 * Este método tem o mesmo efeito de get(0).
	 * Retorna null se a lista estiver vazia.
	 *
	 * @return Object Elemento no primeiro índice da lista ou null se vazia.
	 */
	
	public Object first() {
		
		if (list[0]!=null) return list[0];
		
		return null;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(list);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		List other = (List) obj;
		if (!Arrays.equals(list, other.list))
			return false;
		return true;
	}

	/**
	 * Retorna o último elemento da lista.
	 * Este método tem o mesmo efeito de get(count() - 1).
	 * Retorna null se a lista estiver vazia.
	 *
	 * @return Object elemento no último índice da lista ou null se vazia.
	 */
	public Object last() {
		int tam = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) tam ++;
			else break;
		}
		return list[tam];
	}

	/**
	 * Remove e retorna o elemento contido no índice passado.
	 * Retorna null se não há elemento no índice.
	 *i
	 * @param index Índice do elemento a ser removido.
	 * @return Object elemento removido ou null se o índice não existir.
	 */
	public Object drop (int index) {
		if(index >=0  && index < count() ){
			Object d = new Object();
			d = list[index];
			this.delete(index) ;
		return d;
		}
		return null;
	}

	/**
	 * Remove o elemento contido no índice passado.
	 * Retorna true se o elemento foi removido e false caso contrário.
	 *
	 * @param index Índice do elemento a ser removido.
	 * @return boolean true ou false caso o elemento seja ou não removido.
	 */
	public boolean delete(int index){
		if(index >=0  && index < count() ){
			if(list[index] == null) return false;
			list[index] = null;
			Object list2 [] = new Object[list.length];
		for (int k = 0; k < list2.length; k++) {
			list2 [k] = null;
		}
		
		int p=0;
		for (int t = 0; t < list2.length; t++) {
			if(list[t] != null) {
				list2[p] = list[t]; 
				p++;
			}
		}
		
		return true;
		}
		return false;
	}

	/**
	 * Remove o elemento da lista.
	 * Retorna true se o objeto foi encontrado e removido e false caso contrário.
	 *
	 * @param o Elemento a ser removido.
	 * @return boolean true ou false caso o elemento seja ou não removido.
	 */
	public boolean remove(Object o){
		for (int i = 0; i < list.length; i++) {
			if(list[i] == o) {
				this.delete(i);
				return true;
			}
		}
		
		return false;
		
	/**
	 * Remove todos os elementos da lista.
	 * Este método reseta a lista.
	 */
	}
	public void clean() {
		Object [] list2 = new Object [10];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = null;
		}
		list = list2;
}
	/**
	 * Retorna a quantidade de elementos na lista.
	 *
	 * @return int quantidade de elementos.
	 */

	public int count() {
		int tam = 0 ;
		for (int i = 0; i < list.length; i++) {
			if(list[i] != null) tam ++;
		}
		return tam;
	}
		
		/**
	 * Retorna se há ou não o elemento na lista.
	 *
	 * @param o Elemento a ser verificado.
	 * @return boolean true ou false caso o elemento se encontre ou não na lista.
	 */

	public boolean has(Object o){
	
		for (int i = 0; i < list.length; i++) {
			if (list[i]== o) return true;
		}
		return false;
	}
	/**
	 * Retorna se a lista está vazia.
	 *
	 * @return boolean true ou false se a lista estiver ou não vazia.
	 */
	
		public boolean empty(){
			for (int i = 0; i < list.length; i++) {
				if(list[i] != null) return false;
				
			}
		return true;
	}
}