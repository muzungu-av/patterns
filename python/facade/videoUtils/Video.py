class Video:
    def __init__(self, sourceVideo: str) -> None:
        self.tasks = []
        self.tasks.append(sourceVideo)

    def getTasks(self) -> list[str]:
        return self.tasks

    def toString(self) -> str:
        result = ""
        if len(self.tasks) < 1:
            return result

        result += self.tasks[0]
        result += "\n"

        for element in self.tasks:
            if (element != self.tasks[0]):
                result += element
                if (self.tasks[-1] != element):
                    result += "\n"

        return result