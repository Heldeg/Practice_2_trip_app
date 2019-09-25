package trip.planner

import grails.artefact.DomainClass

class SearchController {

    static scaffold = DomainClass

    def index() {

        params.max = Math.min(params.max ? params.int('max') : 5, 100)

        def tripIndex = Trip.createCriteria().list(params) {
            if (params.query) {
                ilike("description", "%${params.query}%")
            }
        }

        [taskInstanceList: tripIndex, taskInstanceTotal: tripIndex.totalCount]
    }

}