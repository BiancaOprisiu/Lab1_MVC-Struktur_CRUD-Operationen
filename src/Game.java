
public class Game {
        private String GameName;
        private String GameId;
        private String GameCategory;

        public String getId() {
            return GameId;
        }

        public void setId(String id) {
            this.GameId = id;
        }

        public String getName() {
            return GameName;
        }

        public void setName(String name) {
            this.GameName = name;
        }

        public String getCategory() {
            return GameCategory;
        }

        public void setCategory(String category) {
            this.GameCategory = category;
        }
}
