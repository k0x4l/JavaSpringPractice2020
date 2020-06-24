package day40_Encapsulation;

public class Pizza{

        private String size;
        private int CheeseTopping;
        private int PepperoniTopping;
        private int HamTopping;

        public Pizza(String size, int CheeseTopping, int PepperoniTopping, int HamTopping){
            setsize(size);
            setCheeseTopping(CheeseTopping);
            setPepperoniTopping(PepperoniTopping);
            setHamTopping(HamTopping);
        }

        public String getsize(){
            return size;
        }
        public void setsize(String size){
            this.size = size;
        }

        public int getCheeseTopping(){
            return CheeseTopping;
        }

        public void setCheeseTopping(int CheeseTopping){
            this.CheeseTopping = CheeseTopping;
        }

        public int getPepperoniTopping(){
            return PepperoniTopping;
        }

        public void setPepperoniTopping(int PepperoniTopping){
            this.PepperoniTopping = PepperoniTopping;
        }

        public int getHamTopping(){
            return HamTopping;
        }

        public void setHamTopping(int HamTopping){
            this.HamTopping = HamTopping;
        }

        double cost;

        public double calcCost(){
            switch(size){
                case "Small":
                    cost = 10 + CheeseTopping*2 + PepperoniTopping*2 + HamTopping*2;
                    break;
                case "Medium":
                    cost = 12 + CheeseTopping*2 + PepperoniTopping*2 + HamTopping*2;
                    break;
                case "Large":
                    cost = 14 + CheeseTopping*2 + PepperoniTopping*2 + HamTopping*2;
                    break;
            }
            return cost;
        }

        public String getDescription(){
            String result = size+" Pizza with "+CheeseTopping+" Cheese toppings, "+PepperoniTopping+" Pepperoni toppings, and "+HamTopping+" Ham toppings.\nTotal Price: "+calcCost();
            return result;
        }


    }
