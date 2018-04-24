package pl.coderslab.s3ex4;

import java.util.ArrayList;
import java.util.List;

    public class Post implements ObservedSubject {

        private String title;
        private String text;

        private List<Observer> observers = new ArrayList<>();

        public Post(String title, String text) {
            this.setTitle(title);
            this.setText(text);
        }

        //should be in DAO
        public Post savePost(){
            this.notifyAfterAdd();
            return this;
        }

        //should be in DAO
        public Post updatePost(){

            notifyAfterUpdate();
            return this;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        @Override
        public void attachObserver(Observer obs) {
            observers.add(obs);
        }

        @Override
        public void detachObserver(Observer obs) {
            observers.remove(obs);
        }

        @Override
        public void notifyAfterAdd() {
            for (Observer o :observers) {
                o.updateAfterAdd();
            }
        }

        @Override
        public void notifyAfterUpdate() {
            for (Observer o :observers) {
                o.updateAfterUpdate();
            }
        }

        @Override
        public void notifyAfterDelete() {
            for (Observer o :observers) {
                o.updateAfterDelete();
            }
        }

        @Override
        public String toString() {
            return "Post{" +
                    "title='" + title + '\'' +
                    ", text='" + text + '\'' +
                    '}';
        }
    }
