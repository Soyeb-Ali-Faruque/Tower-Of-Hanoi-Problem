class Tower_Of_Hanoi{
    static void plateShifting(int n,String starting,String destination,String helper){
        if(n>=1){
            plateShifting(n-1,starting,helper,destination);
            System.out.println("Moved The Disk "+n+" "+starting+" To "+destination);
            plateShifting(n-1,helper,destination,starting);

        }
    }
    public static void main(String[] args) {

	//Test Values
        plateShifting(3,"A","B","C");

    }
}