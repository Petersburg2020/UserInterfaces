package nx.peter.app.pages.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import nx.peter.app.ui.databinding.FragmentCodeBinding;

public class CodeFragment extends Fragment {
    private FragmentCodeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentCodeBinding.inflate(inflater, container, false);
        binding.view.setText("Where you are I am...\nI can only be with you...");

        // binding.view.addKeywords(CodeEditor.Function.NativeDataType, "int", "float", "double", "boolean", "short", "byte");

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}