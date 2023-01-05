public class Inherit1 {
   private String name;
   private String colour;
   private int callnum;
   private int id;


   Inherit1(String _name, String _colur, int _callnum, int _id, String _model) {
      this.name = _name;
      this.callnum = _callnum;
      this.colour = _colur;
      this.id = _id;


   }

   public Inherit1() {
   }


   public String getName() {
      return name;

   }

   public void setName(String name) {
      this.name = name;


   }

   public String getColour() {
      return colour;


   }public void setColour(String colour) {
      this.colour = colour;


   }public int getCallnum() {
      return callnum;


   }public void setCallnum(int callnum) {
      this.callnum = callnum;

   }public int getId() {
      return id;

   }public void setId(int id) {
      this.id = id;


   }


}

