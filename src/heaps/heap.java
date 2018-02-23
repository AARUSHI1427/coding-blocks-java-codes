package heaps;

import java.util.ArrayList;

public class heap<T extends  Comparable<T>> {
	public ArrayList<T> data;
	private boolean isMin;
	
	public heap(){
		this(false);
	}
	
	public heap(boolean isMin){
		this.data=new ArrayList<>();
		this.isMin=isMin;
		
	}
	public heap(T[] items,boolean isMin){
		this(isMin);
		for(T items:items){
			this.data.add(item);
		}
		for(int i=1;i.this.data.size()/2-1;i>=0;i--){
			this.downHeapify(i);
		}
		downHeapify(0);
	}
	public int size(){
		return this.data.size();
	}
	
	public boolean isEmpty(){
		return this.size()==0;
	}
	
	public void add(T item){
		this.data.add(item);
		this.upheapify(this.data.size()-1);
	}
	
	private void upheapify(int ci){
		if(ci==0){
			return;
		}
		int pi=(ci-1)/2;
		
		if(!isLarger(pi,ci)){
			this.swap(pi,ci);
			this.upheapify(pi);
		}
	}
	
	private boolean isLarger(int i,int j){
		T ithitem=this.data.get(i);
		T jthitem=this.data.get(j);
		if(isMin){
			return ithitem.compareTo(jthitem)<0;
		}else{
			return ithitem.compareTo(jthitem)>0;
		}
	}
	
	private void swap(int i,int j){
		T temp=this.data.get(i);
		this.data.set(i, this.data.get(j));
		this.data.set(j, temp);
	}

	public T remove(){
		T rv=this.data.get(0);
		this.swap(0,this.data.size()-1);
        this.data.remove(this.data.size()-1);
        this.downHeapify(0);
		return rv;
	}
	
	private void downHeapify(int pi){
		int mi=pi;
		int lci=2*pi+1;
		int rci=2*pi+2;
		if(lci<this.data.size()&&isLarger(lci,mi)){
			mi=lci;
		}
		if(rci<this.data.size()&&isLarger(rci,mi)){
			mi=rci;
		}
		if(mi!=pi){
			this.swap(mi, pi);
			this.downHeapify(mi);
		}
	}

}
