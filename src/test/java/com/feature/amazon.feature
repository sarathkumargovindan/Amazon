Feature: Amazon project
@smoke
Scenario: go To The Amazon Homepage
Given launch The Url Of The Homepage
When select The "baby" From The Dropdown
And go To The SearchTab And Search The "toys"
And  compare The Value Of Suggested List
Then get The No Of Products In Result And More Result Tag
