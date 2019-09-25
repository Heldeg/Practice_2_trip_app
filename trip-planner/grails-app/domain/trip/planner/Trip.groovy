package trip.planner

class Trip {
    String title
    String destination
    String description
    int value
    static constraints = {
        title size: 5..15, blank: false, unique: true
        destination size: 3..30, blank: false
        description blank: true
        value min: 1
    }
    
}
