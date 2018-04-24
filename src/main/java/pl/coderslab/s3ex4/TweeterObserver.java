package pl.coderslab.s3ex4;

public class TweeterObserver implements Observer {

        @Override
        public void updateAfterAdd() {
            System.out.println("Tweeter observer add");
        }

        @Override
        public void updateAfterUpdate() {
            System.out.println("Tweeter observer update");
        }

        @Override
        public void updateAfterDelete() {
            System.out.println("Tweeter observer delete");
        }

}
