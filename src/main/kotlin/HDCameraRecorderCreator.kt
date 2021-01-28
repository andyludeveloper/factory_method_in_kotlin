class HDCameraRecorderCreator{
    private lateinit var cameraRecorder:ICameraRecorder

    fun record(){
        cameraRecorder = HDCameraRecorder()
        cameraRecorder.start()
    }
}