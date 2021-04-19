def call(Map config = [:])
{
	sh 'Hello ${config.firstname} ${config.lastname} !!'
}
