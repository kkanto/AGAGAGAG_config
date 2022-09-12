 
listView('AGAGAGAG Jobs') {
    description('AGAGAGAG Jobs')
    jobs {
        regex('AGAGAGAG_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
