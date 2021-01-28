class HDCameraRecorderCreator{
    private lateinit var cameraRecorder:ICameraRecorder

    fun record(){
        cameraRecorder = createCameraRecorder()
        cameraRecorder.start()
    }

    private fun createCameraRecorder() = HDCameraRecorder()
}