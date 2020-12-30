package prs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author LENOVO
 */
public class Methods {
  
    public int pages []=new int[30];//page refrence sequence
    public int fram[]=new int [30];
    public int page;  //forloop 
    
   public boolean hits[]=new boolean[30];

    public boolean[] getHits() {
        return hits;
    }

    public void setHits(boolean[] hits) {
        this.hits = hits;
    }

    public int[] getFault() {
        return fault;
    }

    public void setFault(int[] fault) {
        this.fault = fault;
    }
     
        int fault[]=new int[30];

    public int[] getFram() {
        return fram;
    }

    public void setFram(int[] fram) {
        this.fram = fram;
    }
    public int miss;
    public int faults=0;//number of faults 

    public int getHit() {
        return hit;
    }

    public int getMiss() {
        return miss;
    }

    public void setMiss(int miss) {
        this.miss = miss;
    }
    
    

    public void setHit(int hit) {
        this.hit = hit;
    }
    public int hit;

    public int[] getPages() {
        return pages;
    }

    public void setPages(int[] pages) {
        this.pages = pages;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getFaults() {
        return faults;
    }

    public void setFaults(int faults) {
        this.faults = faults;
    }

    public int getFrames() {
        return frames;
    }

    public void setFrames(int frames) {
        this.frames = frames;
    }

    public Queue<Integer> getMemory() {
        return memory;
    }

    public void setMemory(Queue<Integer> memory) {
        this.memory = memory;
    }

    public HashSet<Integer> getCheck() {
        return check;
    }

    public void setCheck(HashSet<Integer> check) {
        this.check = check;
    }

    public int getFirstpage() {
        return firstpage;
    }

    public void setFirstpage(int firstpage) {
        this.firstpage = firstpage;
    }
    int  frames=0;// frames number taken from user 
    Queue<Integer> memory=new LinkedList<>(); 
    HashSet<Integer>check= new HashSet<>(frames);
    int firstpage;
    int pin; //pointer 
    Boolean isfull=false;
    ArrayList<Integer> list =new ArrayList<Integer>();
    int store[][]; //2D array

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Boolean getIsfull() {
        return isfull;
    }

    public void setIsfull(Boolean isfull) {
        this.isfull = isfull;
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    public int[][] getStore() {
        return store;
    }

    public void setStore(int[][] store) {
        this.store = store;
    }
    
   
    
    
    
}