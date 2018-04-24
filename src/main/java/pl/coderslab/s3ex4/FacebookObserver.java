package pl.coderslab.s3ex4;

public class FacebookObserver implements Observer {

        @Override
        public void updateAfterAdd() {
            System.out.println("Facebook observer add");
        }

        @Override
        public void updateAfterUpdate() {
            System.out.println("Facebook observer update");
        }

        @Override
        public void updateAfterDelete() {
            System.out.println("Facebook observer delete");
        }

}
