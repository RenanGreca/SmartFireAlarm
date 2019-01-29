t<-read.csv("C:/Users/stop0/Documents/Software Engineering/latency_analysis.csv",sep=",")

counts <- as.matrix(t)
par(mar = c(12,6,4,1)+.1)
a <- barplot(counts, main="Latency Flow",
        ylab="Latency (ms)", col=c("darkblue","red"),
        legend = c("Min values","Max values"), beside=TRUE, font = 1,las = 2)
